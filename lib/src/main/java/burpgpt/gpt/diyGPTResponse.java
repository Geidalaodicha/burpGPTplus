package burpgpt.gpt;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class diyGPTResponse {

    private String id;
    private String object;
    private long created;
    private String model;
    @SerializedName("system_fingerprint")
    private String systemFingerprint;
    private Usage usage;
    private List<Choice> choices;

    public static class Choice {
        private int index;
        private Message message;
        private Object logprobs; // Can be null, so we use Object
        @SerializedName("finish_reason")
        private String finishReason;

        public static class Message {
            private String role;
            private String content;

            // Getters and Setters
            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }

        // Getters and Setters
        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Message getMessage() {
            return message;
        }

        public void setMessage(Message message) {
            this.message = message;
        }

        public Object getLogprobs() {
            return logprobs;
        }

        public void setLogprobs(Object logprobs) {
            this.logprobs = logprobs;
        }

        public String getFinishReason() {
            return finishReason;
        }

        public void setFinishReason(String finishReason) {
            this.finishReason = finishReason;
        }
    }

    public static class Usage {
        @SerializedName("prompt_tokens")
        private int promptTokens;
        @SerializedName("completion_tokens")
        private int completionTokens;
        @SerializedName("total_tokens")
        private int totalTokens;
        @SerializedName("completion_tokens_details")
        private TokenDetails completionTokensDetails;
        @SerializedName("prompt_tokens_details")
        private TokenDetails promptTokensDetails;

        public static class TokenDetails {
            @SerializedName("audio_tokens")
            private int audioTokens;
            @SerializedName("reasoning_tokens")
            private int reasoningTokens;
            @SerializedName("cached_tokens")
            private int cachedTokens;

            // Getters and Setters
            public int getAudioTokens() {
                return audioTokens;
            }

            public void setAudioTokens(int audioTokens) {
                this.audioTokens = audioTokens;
            }

            public int getReasoningTokens() {
                return reasoningTokens;
            }

            public void setReasoningTokens(int reasoningTokens) {
                this.reasoningTokens = reasoningTokens;
            }

            public int getCachedTokens() {
                return cachedTokens;
            }

            public void setCachedTokens(int cachedTokens) {
                this.cachedTokens = cachedTokens;
            }
        }

        // Getters and Setters
        public int getPromptTokens() {
            return promptTokens;
        }

        public void setPromptTokens(int promptTokens) {
            this.promptTokens = promptTokens;
        }

        public int getCompletionTokens() {
            return completionTokens;
        }

        public void setCompletionTokens(int completionTokens) {
            this.completionTokens = completionTokens;
        }

        public int getTotalTokens() {
            return totalTokens;
        }

        public void setTotalTokens(int totalTokens) {
            this.totalTokens = totalTokens;
        }

        public TokenDetails getCompletionTokensDetails() {
            return completionTokensDetails;
        }

        public void setCompletionTokensDetails(TokenDetails completionTokensDetails) {
            this.completionTokensDetails = completionTokensDetails;
        }

        public TokenDetails getPromptTokensDetails() {
            return promptTokensDetails;
        }

        public void setPromptTokensDetails(TokenDetails promptTokensDetails) {
            this.promptTokensDetails = promptTokensDetails;
        }
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSystemFingerprint() {
        return systemFingerprint;
    }

    public void setSystemFingerprint(String systemFingerprint) {
        this.systemFingerprint = systemFingerprint;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
}
