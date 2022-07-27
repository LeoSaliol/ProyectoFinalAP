import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { BodyComponent } from "./componentes/body/body.component";
import { EditAcercaComponent } from "./componentes/body/compBody/acerca-de/edit-acerca.component";
import { EditPersonaComponent } from "./componentes/body/compBody/acerca-de/edit-persona.component";
import { EditEstudioComponent } from "./componentes/body/compBody/educacion/edit-estudio.component";
import { NewEstudioComponent } from "./componentes/body/compBody/educacion/new-estudio.component";
import { EditExperienciaComponent } from "./componentes/body/compBody/experiencia/edit-experiencia.component";
import { NewExperienciaComponent } from "./componentes/body/compBody/experiencia/new-experiencia.component";
import { LoginComponent } from "./componentes/login/login.component";

const routes: Routes = [
    { path: 'login', component: LoginComponent },
    { path: 'inicio', component: BodyComponent }, 
    { path:'nuevaest', component:NewEstudioComponent},
    { path:'editest/:id', component:EditEstudioComponent},
    { path: 'nuevaexp', component: NewExperienciaComponent},
    { path:'editexp/:id', component:EditExperienciaComponent},
    { path:'editper/:id', component:EditPersonaComponent},
    { path:'editace/:id', component: EditAcercaComponent},
    { path: '', component: BodyComponent, pathMatch: 'full' },
    { path: '**', redirectTo: '/404', pathMatch: 'full' },
  ];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule{}
