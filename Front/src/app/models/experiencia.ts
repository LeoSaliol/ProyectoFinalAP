export class Experiencia{
    id?:number;
    nomTra:string;
    fechaIni:string;
    fechaFin:string;
    descripcion:string;

    constructor(nomTra: string, fechaIni:string, fechaFin:string, descripcion:string){

        this.nomTra = nomTra;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }
    

}