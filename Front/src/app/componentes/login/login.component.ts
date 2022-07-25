import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginUsuario } from 'src/app/models/login-usuario';
import { AuthService } from 'src/app/service/auth.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})


export class LoginComponent implements OnInit {
  isLogged= false;
  isLogginFail = false;
  loginUsuario!: LoginUsuario;
  nombreUsuario!: string;
  password!: string;
  roles: string[] = [];
  errorMsj!: string;

  constructor(private tokenService:TokenService, private authService:AuthService, private router:Router) { 


  }

  ngOnInit(): void {

    if(this.tokenService.getToken()){
      this.isLogged = true; //Si trae un token significa que esta 
      this.isLogginFail = false; // Si esta logeado no fallo y por eso sigue en false
      this.roles = this.tokenService.getAuthorites();
    }
  }

  onLogin():void{

    this.loginUsuario=new LoginUsuario(this.nombreUsuario, this.password); 
      this.authService.login(this.loginUsuario).subscribe(data => {
      this.isLogged=true;
      this.isLogginFail=false;
      this.tokenService.setToken(data.token);
      this.tokenService.setUserName(data.nombreUsuario);
      this.tokenService.setAuthorities(data.authorities);
      this.roles = data.authorities;
      this.router.navigate(['']);
      
    }, err =>{
      this.isLogged=false;
      this.isLogginFail=true;
      this.errorMsj=err.error.mensaje;
      console.log(this.errorMsj);
      
    } )
  }
  
}
