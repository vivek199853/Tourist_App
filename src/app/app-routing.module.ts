import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { TouristListComponent } from './tourist-list/tourist-list.component';
import { TouristComponent } from './tourist/tourist.component';

const routes: Routes = [
  {path:'touristlist',component:TouristListComponent},
  {path:'tourist',component:TouristComponent},
  {path:'home',component:HomeComponent},
  
  {path:'',redirectTo:'home',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
