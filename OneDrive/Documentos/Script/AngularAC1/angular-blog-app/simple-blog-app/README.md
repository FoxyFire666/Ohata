# Simple Blog Application

This is a simple blog application built with Angular. It simulates a blog where users can view posts, like them, and add comments.

## Project Structure

```
simple-blog-app
├── src
│   ├── app
│   │   ├── app.module.ts        # Main application module
│   │   ├── app.component.ts     # Root component of the application
│   │   ├── app.component.html    # HTML template for the root component
│   │   ├── app.component.css     # CSS styles for the root component
│   │   ├── blog
│   │   │   ├── blog.component.ts  # Blog component class
│   │   │   ├── blog.component.html # HTML template for the blog component
│   │   │   └── blog.component.css  # CSS styles for the blog component
│   │   └── models
│   │       └── post.model.ts      # Post model definition
│   └── assets                      # Folder for static assets
├── angular.json                   # Angular project configuration
├── package.json                   # Project dependencies and scripts
├── tsconfig.json                  # TypeScript configuration
└── README.md                      # Project documentation
```

## Features

- Displays a list of blog posts with titles, authors, publication dates, and content.
- Users can like posts, which increments the like count.
- Users can add comments to each post, which are displayed below the corresponding post.

## Setup Instructions

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```
   cd simple-blog-app
   ```

3. Install the dependencies:
   ```
   npm install
   ```

4. Run the application:
   ```
   ng serve
   ```

5. Open your browser and navigate to `http://localhost:4200` to view the application.

## Usage

- Click the "Curtir" button to like a post.
- Enter a comment in the provided field and click "Comentar" to add it to the post.

## License

This project is licensed under the MIT License.