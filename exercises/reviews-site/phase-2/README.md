# Database-enabling the Reviews Site with JPA and Spring Data

This is a continuation of the [Reviews Site](../phase-1) project. Familiarize yourself with Spring Data/JPA basics with Spring Boot by following the Spring Getting Started Guide [Accessing Data with JPA](http://spring.io/guides/gs/accessing-data-jpa/) before moving on with this phase of the project. Refer to that guide and our [Spring JPA example repository](https://github.com/wecancodeit/java-spring-jpa-example) for examples as you work through the project.

## Enabling JPA

In order to enable JPA, we need to add the dependencies for `spring-boot-starter-data-jpa` and `h2`. This consists of adding the following lines to your dependencies in `build.gradle`:

```gradle
compile("org.springframework.boot:spring-boot-starter-data-jpa")
compile("com.h2database:h2")
```

If you want to setup a Spring MVC/JPA project from scratch, see the [Spring Initializr page](https://github.com/wecancodeit/java-resources/blob/master/project-setup/spring-initializr.md) in our Java resources repository.

## Declaring Entities

The `Review` class, the core of our model, will become an entity in the JPA/database sense, so give it the appropriate annotations to identify it as an entity and denote its primary key.

## Using a Spring CrudRepository

Since we'll be retrieving data from our database, we no longer need to manually populate our reviews. Replace your existing `ReviewRepository` class with a `ReviewRepository` interface that extends Spring Data's `CrudRepository` interface.

## Populating the Database

Rather than using a `CommandLineRunner` like the Getting Started Guide, we're going to use a development feature of Hibernate, the JPA implementation used by Spring Data, to populate our database. This allows us to put a file called `import.sql` on the classpath, consisting of sql commands that will be run after JPA creates our tables. You should put this file in your project at `src/main/resources/import.sql`. You can find an example in our [Spring JPA example repository](https://github.com/wecancodeit/java-spring-jpa-example/blob/master/src/main/resources/import.sql).

Place sql commands into this file to insert reviews.

# Adding Categories for Reviews

## The Category Entity

During this step, we will be adding a new entity, `Category`. Configure this as a JPA entity. Each category should have, at minimum:

- a `long` id used as a primary key
- a title
- a `Collection` of `Review` instances

A category's relationship with its reviews is a one-to-many relationship. (One category for many reviews.) We will also need a `CategoryRepository` interface (extending `CrudInterface`) so that we can retrieve `Category` instances from our database.

Each review should have a category, so give the `Review` class a category attribute. This is a many-to-one relationship. (Many reviews for each category.)

## Populating Categories

Our commands in `import.sql` will need to create categories and assign these categories to reviews. Perform the following tasks in `import.sql`:

- Add commands to create categories.
- Modify the commands used to create review records to assign a category to each review.

## Category Controller and Templates

Create templates and an associated controller so that a user can see a list of all categories, clicking on one to navigate to a list of reviews for that category. Clicking on one of these review titles should open the review.

# Extensions

## Reviews by Category

Update your page for showing all reviews so that it shows reviews by category.

## Category Navigation

Use jQuery and AJAX to retrieve categories and use them to populate a nav bar for your site. You'll need to research the `@RestController` and/or `@RequestBody` annotations to return categories as JSON.

## Search Features

Allow a user to perform searches. This will require declaration of repository methods, creation of controller methods, and updates to your views to support this functionality.
