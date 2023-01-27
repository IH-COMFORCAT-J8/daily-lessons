import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { RandomUserResponse } from '../models/interfaces/random-user-response';

@Injectable({
  providedIn: 'root'
})
export class RandomUserService {

  constructor(private http : HttpClient) { }

  private readonly baseUrl = 'https://randomuser.me/api'


  getRandomUser():Observable<RandomUserResponse> {

    return this.http.get<RandomUserResponse>(this.baseUrl);

  }


}
