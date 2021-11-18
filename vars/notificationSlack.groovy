def call(String channelName, String message, String teamDomain, String tokenCredentialId, String color){
    slackSend channel: "${channelName}", message: "$message", teamDomain: "${teamDomain}", tokenCredentialId: "${tokenCredentialId}", color: "${color}"
}