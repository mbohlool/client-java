
# V1PodCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastProbeTime** | [**UnversionedTime**](UnversionedTime.md) | Last time we probed the condition. |  [optional]
**lastTransitionTime** | [**UnversionedTime**](UnversionedTime.md) | Last time the condition transitioned from one status to another. |  [optional]
**message** | **String** | Human-readable message indicating details about last transition. |  [optional]
**reason** | **String** | Unique, one-word, CamelCase reason for the condition&#39;s last transition. |  [optional]
**status** | **String** | Status is the status of the condition. Can be True, False, Unknown. More info: http://kubernetes.io/docs/user-guide/pod-states#pod-conditions | 
**type** | **String** | Type is the type of the condition. Currently only Ready. More info: http://kubernetes.io/docs/user-guide/pod-states#pod-conditions | 



