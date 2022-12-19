import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { BookService } from 'src/app/Services/book.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  constructor(private bookService: BookService) { }

  registerForm = new FormGroup({
    bookName: new FormControl("", [Validators.required, Validators.pattern("^[a-zA-Z ]*$")]),
    bookAuthor: new FormControl("",[Validators.required, Validators.pattern("^[a-zA-Z ]*$")]),
    bookPrice: new FormControl("", [Validators.required, Validators.pattern("^[0-9]+(\.[0-9]+)?$")]),
    bookGenration: new FormControl("", [Validators.required, Validators.pattern("^[a-zA-Z ]*$")]),
    borrowedStatus: new FormControl("",[Validators.required])
  });

  get BookName(): FormControl{
    return this.registerForm.get("bookName") as FormControl;
  }
  get BookAuthor(): FormControl{
    return this.registerForm.get("bookAuthor") as FormControl;
  }
  get BookPrice(): FormControl{
    return this.registerForm.get("bookPrice") as FormControl;
  }
  get BookGenre(): FormControl{
    return this.registerForm.get("bookGenration") as FormControl;
  }
  get BorrowedStatus(): FormControl{
    return this.registerForm.get("borrowedStatus") as FormControl;
  }

  register(registerForm: FormGroup) {
    console.log(this.registerForm.valid);
    this.bookService.addBook(registerForm.value).subscribe(
      (resp) => {
        console.log(resp);
        registerForm.reset();
      },
      (err) => {
        console.log(err);
      }
    );
  }

  ngOnInit(): void {
  }

}
