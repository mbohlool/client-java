
# V1alpha1PolicyRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiGroups** | **List&lt;String&gt;** | APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed. |  [optional]
**attributeRestrictions** | [**RuntimeRawExtension**](RuntimeRawExtension.md) | AttributeRestrictions will vary depending on what the Authorizer/AuthorizationAttributeBuilder pair supports. If the Authorizer does not recognize how to handle the AttributeRestrictions, the Authorizer should report an error. |  [optional]
**nonResourceURLs** | **List&lt;String&gt;** | NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path This name is intentionally different than the internal type so that the DefaultConvert works nicely and because the ordering may be different. Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as \&quot;pods\&quot; or \&quot;secrets\&quot;) or non-resource URL paths (such as \&quot;/api\&quot;),  but not both. |  [optional]
**resourceNames** | **List&lt;String&gt;** | ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed. |  [optional]
**resources** | **List&lt;String&gt;** | Resources is a list of resources this rule applies to.  ResourceAll represents all resources. |  [optional]
**verbs** | **List&lt;String&gt;** | Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds. | 



