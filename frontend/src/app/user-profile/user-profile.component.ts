import { Component, OnInit } from '@angular/core';
import { KeycloakProfile } from 'keycloak-js';
import { KeycloakService } from 'keycloak-angular';

@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.css']
})
export class UserProfileComponent implements OnInit {

  constructor(private readonly keycloak: KeycloakService) {}

  public perfilUsuario: KeycloakProfile | null = null;

  username = "undefined";
  email = "undefined";
  name = "undefined";
  lastname = "undefined";
 
  async ngOnInit() {

    var perfilUsuario = await this.keycloak.loadUserProfile();
    // this.lastname = perfilUsuario.lastName;
    // this.username = perfilUsuario.username;
    this.email = perfilUsuario.email;
    this.name = perfilUsuario.firstName;
    console.log(perfilUsuario);
  }
 

}
