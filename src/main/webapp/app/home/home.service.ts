import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ApplicationConfigService } from 'app/core/config/application-config.service';

@Injectable({ providedIn: 'root' })
export class HomeService {
  protected facilitiesUrl = this.applicationConfigService.getEndpointFor('api/facilities');

  constructor(protected applicationConfigService: ApplicationConfigService, protected http: HttpClient) {}

  getFacility(id: number): any {
    // console.warn(this.http.get(`http://localhost:9000/api/residents?roomidId.equals=${1}`))
    return { water: true, wifi: true, car: true };
  }

  getResidents(id: number): any {
    return { firstName: 'demo', lastname: 'demo', email: 'demo@demo.com' };
  }
}
