import { connect } from "react-redux";
import { IState } from "../../reducers";
import { RegisterComponent } from "./RegisterComponent";
import { createUser } from "../../action-mappers/register-action";

const mapStateToProps = (state:IState) => {
    return {
        loginMessage:state.userState.loginMessage
    }
}

const mapDispatchToProps = {
    createUser
}

export default connect(mapStateToProps,mapDispatchToProps)(RegisterComponent);