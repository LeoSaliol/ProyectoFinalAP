import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Estudio } from '../models/estudio';

@Injectable({
  providedIn: 'root'
})
export class SEstudioService {

  URL = 'http://localhost:8080/estudio/'

  constructor(private httpCliente:HttpClient ) { }

  public lista():Observable<Estudio[]>{
    return this.httpCliente.get<Estudio[]>(this.URL+'lista');
  }

  public detail(id:number): Observable<Estudio>{
    return this.httpCliente.get<Estudio>(this.URL+`detail/${id}`);
  }

   public save(estudio:Estudio):Observable<any>{
    return this.httpCliente.post<any>(this.URL+`create`, estudio);
   }

   public update(id:number, estudio:Estudio):Observable<any>{
    return this.httpCliente.put<any>(this.URL+`update/${id}`, estudio);
   }

   public delete(id:number):Observable<any>{
    return this.httpCliente.delete<any>(this.URL+`delete/${id}`);
   }


}
