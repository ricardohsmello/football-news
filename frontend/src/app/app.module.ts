import { APP_INITIALIZER, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { KeycloakAngularModule, KeycloakService } from 'keycloak-angular';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserFormComponent } from './user-form/user-form.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { UserService } from './service/user-service.service';

	export function initializeKeycloak(keycloak: KeycloakService) {
		return () =>
		keycloak.init({
			config: {
			url: 'http://localhost:8180/auth/',
			realm: 'football',
			clientId: 'frontend'
			},
		initOptions: {
		onLoad: 'check-sso',
		silentCheckSsoRedirectUri:
			window.location.origin + '/assets/silent-check-sso.html'
		}
		});
	}

	@NgModule({
	  declarations: [
        AppComponent,
        UserListComponent,  
        UserFormComponent
      ],
		  imports: [AppRoutingModule, BrowserModule, HttpClientModule, FormsModule, KeycloakAngularModule],
		  providers: [
		    {
		      provide: APP_INITIALIZER,
		      useFactory: initializeKeycloak,
		      multi: true,
		      deps: [KeycloakService],
		    },
        UserService     
		  ],
		  bootstrap: [AppComponent]
		})
		export class AppModule {}

