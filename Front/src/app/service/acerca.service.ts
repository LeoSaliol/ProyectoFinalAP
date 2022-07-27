import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { acerca } from '../models/acerca';


@Injectable({
  providedIn: 'root'
})
export class AcercaService {

  URL = 'http://localhost:8080/acerca/'


  constructor(private http: HttpClient ) { }

  public getAcerca(): Observable<acerca>{
    return this.http.get<acerca>(this.URL+`traer/perfil`);
  }

  public update(id:number, acerca:acerca):Observable<any>{
    return this.http.put<any>(this.URL+`update/${id}`, acerca);
  }
}
