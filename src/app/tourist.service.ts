import { Injectable } from '@angular/core';
import{HttpClient} from '@angular/common/http'
import{Observable} from 'rxjs'
import { Tourist } from './tourist';

@Injectable({
  providedIn: 'root'
})
export class TouristService {
  private baseUrl="http://localhost:8765/tourist/";
  constructor(private httpClient:HttpClient) { }

  getTouristList():Observable<Tourist[]>{
    return this.httpClient.get<Tourist[]>(`${this.baseUrl}`);


  }
  private baseUrll="http://localhost:8765/tourist/add";
  registerUser(tourist:Tourist):Observable<object>{
    console.log(tourist);
    return this.httpClient.post(`${this.baseUrll}`,tourist);
  }



}
