import { Component } from '@angular/core';
import { Post } from '../models/post.model';

@Component({
  selector: 'app-blog',
  templateUrl: './blog.component.html',
  styleUrls: ['./blog.component.css']
})
export class BlogComponent {
  posts: Post[] = [
    {
      title: 'First Post',
      author: 'Author One',
      date: new Date('2023-01-01'),
      content: 'This is the content of the first post.',
      likes: 0,
      comments: []
    },
    {
      title: 'Second Post',
      author: 'Author Two',
      date: new Date('2023-02-01'),
      content: 'This is the content of the second post.',
      likes: 0,
      comments: []
    },
    {
      title: 'Third Post',
      author: 'Author Three',
      date: new Date('2023-03-01'),
      content: 'This is the content of the third post.',
      likes: 0,
      comments: []
    }
  ];

  likePost(post: Post): void {
    post.likes++;
  }

  addComment(post: Post, comment: string): void {
    if (comment) {
      post.comments.push(comment);
    }
  }
}