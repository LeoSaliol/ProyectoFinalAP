import { Component, OnInit } from '@angular/core';
import { Estudio } from 'src/app/models/estudio';
import { SEstudioService } from 'src/app/service/s-estudio.service';
import { TokenService } from 'src/app/service/token.service';


@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {

  // traigo el model
  est:Estudio[]=[];


  constructor(private sEstudio:SEstudioService, private tokenService:TokenService) { }

  isLogged= false;

  ngOnInit(): void {
    this.cargarEstudio();
    if(this.tokenService.getToken()){
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }

  cargarEstudio():void{
    this.sEstudio.lista().subscribe(
      data => {this.est=data}
    )
  }

  delete(id?:number){
    if (id != undefined) {
      this.sEstudio.delete(id).subscribe(
        data => {
          this.cargarEstudio();
        }, err => {
          alert("No se pudo eliminar la educacion");
        }
      )
    }
  }

}
