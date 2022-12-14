export interface RandomUserResponse {
    results: Array<RandomUser>;

}

export interface RandomUser {

    name: {
        title: string;
        first: string;
        last: string;
    }
    dob : {
        age: number;
    }
    location: {
        country: string;
    }

    picture :{
        medium: string;
    }

}
