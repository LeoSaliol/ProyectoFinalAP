import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { acerca } from 'src/app/models/acerca';
import { AcercaService } from 'src/app/service/acerca.service';

@Component({
  selector: 'app-edit-acerca',
  templateUrl: './edit-acerca.component.html',
  styleUrls: ['./edit-acerca.component.css']
})
export class EditAcercaComponent implements OnInit {

  acerca:acerca = new acerca("");

  constructor(private sAcerca:AcercaService, private activatedRouter: ActivatedRoute, private route:Router) { }

  ngOnInit(): void {
    this.sAcerca.getAcerca().subscribe(
      data => {
        this.acerca = data;
      }, err =>{
        alert("Error al editar");
        this.route.navigate(['']);
      }
    )
  }

  onUpdate():void{
    const id = this.activatedRouter.snapshot.params['id'];
    this.sAcerca.update(id, this.acerca).subscribe(
      data => {
        this.route.navigate(['']);
      }, err =>{
        alert("Error al editar descripcion");
        this.route.navigate(['']);
      }
    )
  }

}
