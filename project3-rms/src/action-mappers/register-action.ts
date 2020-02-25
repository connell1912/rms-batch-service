import IUser from "../model/IUser"
import { addUser } from "../utility/api"


export const createTypes = {
    SUCCESSFUL_CREATE: 'CREATE_SUCCESSFUL_CREATE',
    UNSUCCESSFUL_CREATE: 'CREATE_UNSUCCESSFUL_CREATE'
}


export const createUser = (newUser:IUser) => async (dispatch:any) => {
    let response:any = await addUser(newUser);
    if(response.body){
        dispatch({
            type:createTypes.SUCCESSFUL_CREATE,
            payload:{
                currentUser:response.data
            }
        })
    }else {
        dispatch({
            type:createTypes.UNSUCCESSFUL_CREATE,
            payload: {
                createMessage:response.createMessage
            }
        })
    }
}
