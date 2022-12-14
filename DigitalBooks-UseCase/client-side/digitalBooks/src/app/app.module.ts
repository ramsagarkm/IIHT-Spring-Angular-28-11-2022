import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { SignUpComponent } from './components/sign-up/sign-up.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { SearchComponent } from './components/search/search.component';
import { AddBookComponent } from './components/add-book/add-book.component';
import { MatCardModule } from '@angular/material/card';
import { ViewBookComponent } from './components/view-book/view-book.component';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { SubscribedBookComponent } from './components/subscribed-book/subscribed-book.component';
import { NotificationComponent } from './components/notification/notification.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    LoginComponent,
    SignUpComponent,
    HeaderComponent,
    FooterComponent,
    SearchComponent,
    AddBookComponent,
    ViewBookComponent,
    SubscribedBookComponent,
    NotificationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NoopAnimationsModule,
    ReactiveFormsModule,
    HttpClientModule,
    CommonModule,
    MatCardModule,
    MatSnackBarModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }