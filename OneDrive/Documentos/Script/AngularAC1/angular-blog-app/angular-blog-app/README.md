# Angular Blog Application

This is a simple blog application built with Angular. The application allows users to view blog posts, like them, and add comments.

## Features

- Display a list of blog posts with details such as title, author, publication date, content, and likes.
- Users can like posts, which increments the like count.
- Users can add comments to individual posts.

## Project Structure

```
angular-blog-app
├── src
│   ├── app
│   │   ├── app.module.ts        # Main module of the application
│   │   ├── app.component.ts     # Root component
│   │   ├── app.component.html   # Template for the root component
│   │   ├── blog
│   │   │   ├── blog.component.ts # Blog component logic
│   │   │   ├── blog.component.html # Template for the blog component
│   │   │   └── blog.component.css  # Styles for the blog component
│   │   └── models
│   │       └── post.model.ts    # Post model definition
│   └── assets                    # Static assets
├── angular.json                 # Angular project configuration
├── package.json                 # npm configuration
└── tsconfig.json                # TypeScript configuration
```

## Getting Started

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```
   cd angular-blog-app
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

## Contributing

Feel free to submit issues or pull requests for any improvements or features you would like to see in the application.