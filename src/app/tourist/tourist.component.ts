import { Component, OnInit } from '@angular/core';
import { Tourist } from '../tourist';
import { TouristService } from '../tourist.service';

@Component({
  selector: 'app-tourist',
  templateUrl: './tourist.component.html',
  styleUrls: ['./tourist.component.css']
})
export class TouristComponent implements OnInit {
  tourist:Tourist=new Tourist();
  constructor(private touristService:TouristService) { }

  ngOnInit(): void {
  }
  registerTourist(){
    console.log(this.tourist);
    this.touristService.registerUser(this.tourist).subscribe(data=>{
      alert("Successfully registered Tourist")
    },error=>alert("Tourist is not registered"));
  }
   

}
