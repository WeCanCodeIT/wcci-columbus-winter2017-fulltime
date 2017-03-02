# Professional Portfolio

## Overview

Create a portfolio site highlighting your work that can be shared with potential employers. Focus first on building a good structure that you can later style with CSS.

Your site should have several sections. These could be sections of a single page or multiple pages. Just remember the page that will be loaded/seen first is `index.html`.

Your projects section should include at least three projects. Pick those of which you are most proud. You can add/update/remove projects from this section as time goes on. Consider creating project pages using GitHub Pages (see https://help.github.com/articles/user-organization-and-project-pages/#project-pages) for html-based projects and linking to those (rather than the repository) in order to demonstrate your work. 

Employers may look at your site on a mobile device, so build a responsive layout and verify its responsiveness after it is published to GitHub.

## Tasks

### Required Tasks

- [ ] Set up your *username*.github.io site as per the instructions at https://pages.github.com.

- Modify your main page (`index.html`) to build a personal portfolio, including the following:

    - [ ] About Me
      - [ ] brief biographical information
      - [ ] photo
      - [ ] contact information
      - [ ] links to your professional networking site profiles, including at least GitHub and LinkedIn
      - [ ] list of skills
      - [ ] whatever other information you consider pertinent

    - [ ] Projects (3)
      - [ ] name of project, linked to GitHub repository or the repository/project's GitHub Pages
      - [ ] screenshot
      - [ ] skills / technologies used

    - Create a layout using Bootstrap that:
        - [ ] is responsive
        - [ ] does not look like a standard bootstrap template.

            Try looking for templates online to be used as a starting place. The pros do it all the time.

    - Any resource (images, etc) you use should be:
        - [ ] free for non-commercial use
        - [ ] copied to your repository and referenced there rather than via a uri pointing to another site

    - Create a section/page on your site that lists your GitHub repositories that is populated by accessing the GitHub API via jQuery and AJAX. Establish the structure/layout of your site by building the other sections before doing this part. This section/page should:
        - [ ] Send a GET request to retrieve your basic information (the url will look like `https://api.github.com/users/*your_username*`)
        - [ ] Use the "repos_url" attribute from this response to send another GET request that retrieves information about your repositories.
        - Populate the repositories based on the response. For each repository, at minimum, display:
            - [ ] its name, linking to the repository page ("name" attribute and "html_url" attribute from response)
            - [ ] its last update time ("updated_at" attribute from response)  
        - Create sections/pages with other things from your profile if you like. These can give people insight into your personality/interests. Suggestions:
            - "subscriptions_url": repositories to which you have subscribed
            - "starred_url": repositories you have starred (favorited)
            - "gists_url": public gists
            - "following_url": users/organizations you follow

        Reference: [GitHub API v3 | GitHub Developer Guide](https://developer.github.com/v3/)

### Stretch Tasks

- Try incorporating fancy features such as:
  - [ ] a project screenshot carousel
  - [ ] parallax scrolling
  - [ ] [Material Design](https://material.google.com) effects
  - [ ] elements popping in as the page scrolls