import { Component, OnInit } from '@angular/core';
import {Tourist} from '../tourist'
import { TouristService } from '../tourist.service';
@Component({
  selector: 'app-tourist-list',
  templateUrl: './tourist-list.component.html',
  styleUrls: ['./tourist-list.component.css']
})
export class TouristListComponent implements OnInit {
  tourists:Tourist[] | undefined;
  constructor(private touristService:TouristService) { }

  ngOnInit(): void {
    this.getTourist();
  }
  private getTourist(){
    this.touristService.getTouristList().subscribe(data =>{
      this.tourists=data;
    })
  }

}
