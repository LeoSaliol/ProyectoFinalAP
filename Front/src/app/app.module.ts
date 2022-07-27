import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule, HttpClient} from '@angular/common/http';
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
import { ProyectosComponent } from './componentes/body/compBody/proyectos/proyectos.component';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { interceptorProvider } from './service/interceptor.service';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NewExperienciaComponent } from './componentes/body/compBody/experiencia/new-experiencia.component';
import { EditExperienciaComponent } from './componentes/body/compBody/experiencia/edit-experiencia.component';
import { EditPersonaComponent } from './componentes/body/compBody/acerca-de/edit-persona.component';
import { NewEstudioComponent } from './componentes/body/compBody/educacion/new-estudio.component';
import { EditEstudioComponent } from './componentes/body/compBody/educacion/edit-estudio.component';
import { EditAcercaComponent } from './componentes/body/compBody/acerca-de/edit-acerca.component';




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
    ProyectosComponent,
    NewExperienciaComponent,
    EditExperienciaComponent,
    EditPersonaComponent,
    NewEstudioComponent,
    EditEstudioComponent,
    EditAcercaComponent,
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot(),
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule
    
  ],
  providers: [
    interceptorProvider
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
