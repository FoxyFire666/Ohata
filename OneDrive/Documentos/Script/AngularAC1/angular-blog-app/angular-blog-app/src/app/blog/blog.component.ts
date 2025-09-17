export class Post {
  title: string;
  author: string;
  date: Date;
  content: string;
  likes: number;
  comments: string[];

  constructor(title: string, author: string, content: string) {
    this.title = title;
    this.author = author;
    this.date = new Date();
    this.content = content;
    this.likes = 0;
    this.comments = [];
  }
}

import { Component } from '@angular/core';
import { Post } from '../models/post.model';

@Component({
  selector: 'app-blog',
  templateUrl: './blog.component.html',
  styleUrls: ['./blog.component.css']
})
export class BlogComponent {
  posts: Post[] = [
    new Post('First Post', 'Author 1', 'This is the content of the first post.'),
    new Post('Second Post', 'Author 2', 'This is the content of the second post.'),
    new Post('Third Post', 'Author 3', 'This is the content of the third post.')
  ];

  addComment(post: Post, comment: string): void {
    if (comment) {
      post.comments.push(comment);
    }
  }

  likePost(post: Post): void {
    post.likes++;
  }
}