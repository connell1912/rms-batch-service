import { IRegisterState } from "."
import { createTypes } from "../action-mappers/register-action";

const initialState:IRegisterState = {
    newUser:null,
    createMessage:''
}


export const createReducer = (state = initialState, action:any) => {

    switch (action.type) {
        case createTypes.SUCCESSFUL_CREATE:{
            return {
                ...state,
                newUser:action.payload.newUser,
                createMessage: 'You have Created New User'
            }
        }
        case createTypes.UNSUCCESSFUL_CREATE: {
            return {
                ...state,
                createMessage:action.payload.createMessage
            }
        }
    
        default:
            return state;
    }
}