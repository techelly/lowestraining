import http from '../http-common';
class TutorialsDataService{

    getAll(){
        return http.get("/tutorials");
    }
    create(data){
        console.log("Inside create method - post add")
        return http.post("/tutorials");
    }
}

export default new TutorialsDataService();