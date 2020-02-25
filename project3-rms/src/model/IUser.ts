export enum roles {
    TRNG_MNGR,
    BLDG_MNGR,
    TRAINER,
    LOCKED
}

export default interface IUser {
    userId?: number,
    username: string,
    password: string,
    employeeId?: number,
    roles?: roles
}