import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { persona } from 'src/app/models/persona';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-edit-persona',
  templateUrl: './edit-persona.component.html',
  styleUrls: ['./edit-persona.component.css']
})
export class EditPersonaComponent implements OnInit {

  persona: persona = null;
  constructor(private sPersona:PersonaService, private activateRouter:ActivatedRoute, private router:Router) { }

  ngOnInit(): void {
    const id = this.activateRouter.snapshot.params['id'];
    this.sPersona.getPersona().subscribe(
      data => {
        this.persona = data;
      }, err => {
        alert("Error al modificar");
        this.router.navigate(['']);
      }
    )
  }

  onUpdate():void{
    
    const id = this.activateRouter.snapshot.params['id'];
    this.sPersona.update(id, this.persona).subscribe(
      data=>{
        this.router.navigate(['']);
      }, err =>{
        alert("Error al editar");
        this.router.navigate(['']);
      }
    )
  }

}
