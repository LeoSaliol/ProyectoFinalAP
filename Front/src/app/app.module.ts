import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import {HttpClientModule, HttpClient} from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { NavComponent } from './componentes/nav/nav.component';
import { LoginComponent } from './componentes/login/login.component';
import { BodyComponent } from './componentes/body/body.component';
import { HeaderComponent } from './componentes/body/compBody/header/header.component';
import { ExperienciaComponent } from './componentes/body/compBody/experiencia/experiencia.component';
import { AcercaDeComponent } from './componentes/body/compBody/acerca-de/acerca-de.component';
import { EducacionComponent } from './componentes/body/compBody/educacion/educacion.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HardySkillComponent } from './componentes/body/compBody/hardy-skill/hardy-skill.component';
import { FooterComponent } from './componentes/body/compBody/footer/footer.component';

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
    ExperienciaComponent,
    AcercaDeComponent,
    EducacionComponent,
    HardySkillComponent,
    FooterComponent,
    
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    NgCircleProgressModule.forRoot(),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
