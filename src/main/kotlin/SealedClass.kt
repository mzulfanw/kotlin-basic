sealed class Result {
    data class Success(val dataUser: UserData) : Result()
    data class Error(val message: String) : Result()
    object Loading : Result()
}