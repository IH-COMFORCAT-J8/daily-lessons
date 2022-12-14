import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainComponent } from './components/main/main.component';
import { TextEditorComponent } from './components/text-editor/text-editor.component';
import { ShoppingListComponent } from './components/shopping-list/shopping-list.component';
import { MenuComponent } from './components/menu/menu.component';
import { FanListComponent } from './components/fan-list/fan-list.component';
import { FanCardComponent } from './components/fan-card/fan-card.component';

@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    TextEditorComponent,
    ShoppingListComponent,
    MenuComponent,
    FanListComponent,
    FanCardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
