import { Component, OnInit } from '@angular/core';
import { acerca } from 'src/app/models/acerca';
import { persona } from 'src/app/models/persona';
import { AcercaService } from 'src/app/service/acerca.service';
import { PersonaService } from 'src/app/service/persona.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {
  persona: persona = new persona("","","");
  acerca: acerca = new acerca(""); 
  constructor(public personaService: PersonaService,
              public acercaService: AcercaService,
              public tokenService:TokenService) { }

    isLogged = false;

  ngOnInit(): void {

    this.personaService.getPersona().subscribe(data => {this.persona = data});
    this.acercaService.getAcerca().subscribe(data => {this.acerca = data});

    if(this.tokenService.getToken()){
      this.isLogged=true;
    } else {
      this.isLogged=false;
    }

    
  }

  

}
