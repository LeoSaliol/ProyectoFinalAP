import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { acerca } from '../models/acerca';


@Injectable({
  providedIn: 'root'
})
export class AcercaService {

  URL = environment.apiBaseUrl+'/acerca';


  constructor(private http: HttpClient ) { }

  public getAcerca(): Observable<acerca>{
    return this.http.get<acerca>(this.URL+'/traer/1');
  }
}
