import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http: HttpClient) { }

  API = 'http://localhost:5555';

  public addBook(bookData) {
    return this.http.post(this.API + '/book/addBook', bookData);
  }

  public getBooks() {
    return this.http.get(this.API + '/getAllBooks');
  }

  public deleteBook(id: any) {
    return this.http.delete(this.API + '/deleleBook/' + id);
  }

}
