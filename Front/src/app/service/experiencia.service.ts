import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Experiencia } from '../models/experiencia';



@Injectable({
  providedIn: 'root'
})
export class ExperienciaService {

  URL = environment.apiBaseUrl+'/experiencia';

  constructor(private http: HttpClient ) { }


  public getExperiencia(): Observable<Experiencia[]>{
    return this.http.get<Experiencia[]>(this.URL+'/traer');
  }

  

}
