import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { BodyComponent } from "./componentes/body/body.component";
import { EditExperienciaComponent } from "./componentes/body/compBody/experiencia/edit-experiencia.component";
import { NewExperienciaComponent } from "./componentes/body/compBody/experiencia/new-experiencia.component";
import { LoginComponent } from "./componentes/login/login.component";

const routes: Routes = [
    { path: 'login', component: LoginComponent },
    { path: 'nuevaexp', component: NewExperienciaComponent},
    { path: 'inicio', component: BodyComponent }, 
    { path:'editexp/:id', component:EditExperienciaComponent},
    { path: '', component: BodyComponent, pathMatch: 'full' },
    { path: '**', redirectTo: '/404', pathMatch: 'full' },
  ];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule{}
