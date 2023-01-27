import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FanListComponent } from './components/fan-list/fan-list.component';
import { RegisterComponent } from './components/register/register.component';
import { ShoppingListComponent } from './components/shopping-list/shopping-list.component';
import { TextEditorComponent } from './components/text-editor/text-editor.component';

const routes: Routes = [
  { path: '', redirectTo: '/main', pathMatch: 'full' },
  { path: 'main', component: TextEditorComponent },
  { path: 'shopping-list', component: ShoppingListComponent },
  {path: 'fans', component: FanListComponent},
  {path: 'register', component: RegisterComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
