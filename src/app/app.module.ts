import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { NavComponent } from './componentes/nav/nav.component';
import { LoginComponent } from './componentes/login/login.component';
import { BodyComponent } from './componentes/body/body.component';
import { HeaderComponent } from './componentes/body/compBody/header/header.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'inicio', component: BodyComponent }, 
  { path: '', component: BodyComponent, pathMatch: 'full' },
  { path: '**', redirectTo: '/404', pathMatch: 'full' },
];

@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    LoginComponent,
    BodyComponent,
    HeaderComponent,
    
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
