/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 *
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */
package org.opensearch.commons.notifications.model

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

internal class SNSTests {

    @Test
    fun `SNS should throw exception if empty topic`() {
        assertThrows(IllegalArgumentException::class.java) {
            SNS("", null)
        }
    }

    @Test
    fun `SNS should throw exception if invalid topic ARN`() {
        assertThrows(IllegalArgumentException::class.java) {
            SNS("arn:aws:es:us-east-1:012345678989:test", null)
        }
    }
}