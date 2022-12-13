export class ShoppingItem {

    private _name: string;
    private _quantity: number;

    constructor(name: string, quantity: number) {
        this._name = name;
        this._quantity = quantity;
    }

    get name(): string {
        return this._name;
    }

    set name(value: string) {
        this._name = value;
    }

    get quantity(): number {
        return this._quantity;
    }

    set quantity(value: number) {
        this._quantity = value;
    }

}
