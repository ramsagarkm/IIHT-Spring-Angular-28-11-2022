import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddBookComponent } from './Components/add-book/add-book.component';
import { HomeComponent } from './Components/home/home.component';
import { SearchBooksComponent } from './Components/search-books/search-books.component';

const routes: Routes = [
  {path:"",component: HomeComponent},
  {path:"add-book",component: AddBookComponent},
  {path:"search-books",component: SearchBooksComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
