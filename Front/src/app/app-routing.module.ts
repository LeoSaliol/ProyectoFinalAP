import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { BodyComponent } from "./componentes/body/body.component";
import { LoginComponent } from "./componentes/login/login.component";

const routes: Routes = [
    { path: 'login', component: LoginComponent },
    { path: 'inicio', component: BodyComponent }, 
    { path: '', component: BodyComponent, pathMatch: 'full' },
    { path: '**', redirectTo: '/404', pathMatch: 'full' },
  ];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule{}
