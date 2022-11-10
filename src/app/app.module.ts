import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TouristListComponent } from './tourist-list/tourist-list.component';
import{HttpClientModule} from '@angular/common/http'
import { FormsModule } from '@angular/forms';
import { TouristComponent } from './tourist/tourist.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    TouristListComponent,
    TouristComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
