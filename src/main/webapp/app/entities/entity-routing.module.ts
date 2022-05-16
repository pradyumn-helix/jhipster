import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'resident',
        data: { pageTitle: 'myApp.resident.home.title' },
        loadChildren: () => import('./resident/resident.module').then(m => m.ResidentModule),
      },
      {
        path: 'room',
        data: { pageTitle: 'myApp.room.home.title' },
        loadChildren: () => import('./room/room.module').then(m => m.RoomModule),
      },
      {
        path: 'facility',
        data: { pageTitle: 'myApp.facility.home.title' },
        loadChildren: () => import('./facility/facility.module').then(m => m.FacilityModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class EntityRoutingModule {}
