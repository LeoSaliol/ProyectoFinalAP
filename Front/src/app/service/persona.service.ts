import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from '../models/persona';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  URL = 'http://localhost:8080/personas/'

  constructor(private http: HttpClient) { }


  public getPersona(): Observable<persona>{
    return this.http.get<persona>(this.URL+'traer/perfil');
  }

  
  public update(id:number, person:persona):Observable<any>{
    return this.http.put<any>(this.URL+`editar/${id}`, person);
   }

   



}
