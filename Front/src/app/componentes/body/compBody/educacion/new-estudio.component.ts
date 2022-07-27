import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Estudio } from 'src/app/models/estudio';
import { SEstudioService } from 'src/app/service/s-estudio.service';

@Component({
  selector: 'app-new-estudio',
  templateUrl: './new-estudio.component.html',
  styleUrls: ['./new-estudio.component.css']
})
export class NewEstudioComponent implements OnInit {
  nombreEs:string = '';
  descripcionEs:string = '';

  constructor(private sEstudio:SEstudioService, private router:Router) { }

  ngOnInit(): void {
  }

  onCreate():void{
    const est = new Estudio(this.nombreEs, this.descripcionEs);
    this.sEstudio.save(est).subscribe(
      data=>{ alert("Experiencia creada!");
    this.router.navigate([''])
    }, err =>{
      alert("Fallo");
      this.router.navigate(['']);
    }
    )
  }

  

}
