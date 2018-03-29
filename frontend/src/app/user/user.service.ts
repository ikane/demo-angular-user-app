import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../models/user.model';

@Injectable()
export class UserService {

  constructor(private http: HttpClient) { }

  //private userUrl = 'http://localhost:8080/api';
  private userUrl = '/api';

  public getUsers() {
    return this.http.get<User[]>(this.userUrl);
  }

  public createUser(user: User) {
    return this.http.post(this.userUrl, user);
  }

  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/"+ user.id);
  }
}
