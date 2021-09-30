import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProviderApiService {

  constructor(public http:HttpClient) { }

  
  
  getDatos(): Observable<any[]> {
    return this.http.get<any[]>('https://randomuser.me/api/?results=25');
}

}
