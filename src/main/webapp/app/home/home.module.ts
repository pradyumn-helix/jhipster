import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { SharedModule } from 'app/shared/shared.module';
import { HOME_ROUTE } from './home.route';
import { HomeComponent } from './home.component';
import { EntityRoutingModule } from 'app/entities/entity-routing.module';

@NgModule({
  imports: [SharedModule, RouterModule.forChild([HOME_ROUTE]), EntityRoutingModule],
  declarations: [HomeComponent],
})
export class HomeModule {}
